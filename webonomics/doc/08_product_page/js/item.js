function make_product_table (category) {
<<<<<<< HEAD

    var php_page = "get_item.php" + "?search=" + category;

    $.post( php_page).done(function( data ) {
            result = jQuery.parseJSON(data);
            var item_table = document.getElementById('item_tab');
            var desc_table = document.getElementById('desc_tab');
            var i = 0;
            var j = 1;
            var numCols = 5;
            var row = ' ';
            var tbl = '<table border="1" align="center" width="100%"><tr>';

            for(var k in result) {
                name = result[k].prod_name;
                price = result[k].prod_price;
                product = result[k].prod_image;
                seller = result[k].prod_seller;
                year = result[k].prod_year;
                desc = result[k].prod_desc;
                quantity = result[k].prod_quantity;
=======
        var php_page = "get_item.php" + "?search=" + category;
$.post( php_page).done(function( data ) {
                result = jQuery.parseJSON(data);
                var item_table = document.getElementById('item_tab');
                var desc_table = document.getElementById('desc_tab');
                var i = 0;
                var j = 1;
                var numCols = 5;
                var row = ' ';
                var tbl = '<table border="1" align="center" width="100%"><tr>';
          
                for(var k in result) {
                        name = result[k].prod_name;
                        price = result[k].prod_price;
                        product = result[k].prod_image;
                        seller = result[k].prod_seller;
                        year = result[k].prod_year;
                        desc = result[k].prod_desc;
                        quantity = result[k].prod_quantity;

                        row = row + "<td align=\"center\">" + "<div style=\"height:230px\">" + "<a href=\"#\"><img id=\"image\"  src = \"" + product + "\" onclick=\"make_item_description(\'"+category+"\'"+",\'"+name+"\',\'"+seller+"\',\'"+quantity+"\',\'"+desc+"\',\'"+year+"\'"+") \">" + "</a></div> <div><h5>" + name  + " </h5></div> <div><h5>Rs. " + price  + "</h5></div><div><button onclick=\"location.href = '../09_payment_page/payment.html?n=" + name+ "=" +price +"';\">Buy</button></div> </td>";

                    //    row = row + "<td align=\"center\">" + "<div style=\"height:230px\">" + "<img src = \"" + product + "\" onclick=\"make_item_description(\'"+category+"\'"+",\'"+name+"\',\'"+seller+"\',\'"+quantity+"\',\'"+desc+"\',\'"+year+"\'"+") \">" + "</div> <div><h5>" + name  + " </h5></div> <div><h5>Rs. " + price  + "</h5></div><div><button onclick=\"location.href = '../09_payment_page/payment.html?n=" + name+ "=" +price +"';\">Buy</button></div> </td>";
                        //window.alert(row);
                        if (j%numCols == 0) {
                                tbl = tbl + row + "</tr>";
                                row = '';
                        }
                        j++;
                }
                item_table.innerHTML = tbl + "</table>";
        });
       }
>>>>>>> master

                row = row + "<td align=\"center\">" + "<div style=\"height:230px\">" + "<a href=\"#description\"><img src = \"" + product + "\" onclick=\"make_item_description(\'"+category+"\',\'"+name+"\',\'"+seller+"\',\'"+year+"\',\'"+desc+"\',\'"+quantity+"\') \">" + "</a></div> <div><h5>" + name  + " </h5></div> <div><h5>Rs. " + price  + "</h5></div><div><button onclick=\"location.href = '../09_payment_page/payment.html?n=" + name+ "=" +price + "=" + quantity+"';\">Buy</button></div> </td>";

<<<<<<< HEAD
                if (j%numCols == 0) {
                    tbl = tbl + row + "</tr>";
                    row = '';
                }
                j++;
            }
            item_table.innerHTML = tbl + "</table>";
    });
}

function make_item_description (category,name,seller,year,desc,quantity) {
    var item_table = document.getElementById('desc_table');
    var row = ' ';
    var start_div = '<div class=\"popup\">';
    var end_div = "</div>";

    row = row + start_div + "<h2>" + name + "- </h2> by " + seller + "-" + year + "<button class=\"close\" onclick=\"hide_div()\" >x</button><div class=\"content\"><p> Description: </p><p>" + desc + "</p><p> Quantity Available: " + quantity + "</p></div>" + end_div;

    item_table.innerHTML = row;
}

function hide_div() {
    document.getElementsByClassName('popup')[0].style.visibility = 'hidden';
}
=======
function make_item_description (category,name,seller,quantity,desc,year) {
        window.alert("called");
        var msg = name + "-" + seller + "\n" + "Description: " + desc + "\n- " + year + "\nQuantity: " + quantity;
        window.alert(msg);

                var item_table = document.getElementsByClassName('desc_table');
                if(item_table) {
                        window.alert("hehe");
                }
                else{
                        window.alert("wow");
                }
                var row = ' ';
                var start_div;
                var end_div = "</div>";
          

                row = row + "<h2>" + name + "- </h2> by " + seller + "-" + year + "<button id=\"CloseBtn\">x</button><div class=\"content\"><p> Description: </p><p>" + desc + "</p><p> Quantity Available: " + quantity + "</p></div>";

                item_table.innerHTML = row;
                create_popup();
};

function create_popup() {
                var overlay = document.getElementById("overlayx");
                if(overlay) {
                        window.alert("ff");
                }
                else {
                        window.alert("kk");
                }
                var popup = document.getElementById("popupx");
                overlay.style.display = "block";
                popup.style.display = "block";
                //};

                document.getElementById("CloseBtn").innerHTML.onclick = function() {
                        window.alert("close");
                //        var overlay = document.getElementById("overlayx");
                //        var popup = document.getElementById("popupx");
                //        overlay.style.display = "none";
                //        popup.style.display = "none";
                //        
                };
                return 0;
                };
>>>>>>> master
