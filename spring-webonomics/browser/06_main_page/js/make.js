function make_category_table () {
$.post( "get_category.php").done(function( data ) {
                result = jQuery.parseJSON(data);
                var cat_table = document.getElementById('cat_table');
                var i = 0;
                var j = 1;
                var numCols = 2;
                var row = ' ';
                var tbl = '<table border="1" align="center" width="100%"><tr>';
                for(var k in result) {
                        id = result[k].cat_id;
                        name = result[k].cat_name;
                        hide = result[k].hide_section;
                        src  = result[k].image;

                        row = row + "<td>" + "<a href=\"../08_product_page/product.html?search=" + name +"\"><img src=\""+src+"\"</img><br>" + name + "</a> </td>";
                        if (j%numCols == 0) {
                                tbl = tbl + row + "</tr>";
                                row = '';
                        }
                        j++;
                }
                cat_table.innerHTML = tbl + "</table>";
        });
       }

