<?php

$name = $_POST['name'];
$address = $_POST['address'];
$email = $_POST['email'];
$number = $_POST['number'];
$prod_name = $_POST['prod_name'];
$prod_price = $_POST['prod_price'];
$prod_quantity = $_POST['prod_quantity'];
$entered_quantity = $_POST['quantity'];
//$total = $_POST['total'];

if ($entered_quantity > $prod_quantity) {
        echo "<script>
                alert(\"Incorrect quantity\");
                window.history.go(-1);
              </script>";
}

$total = $prod_price * $entered_quantity;

$exp_del_date = Date('d-m-Y',strtotime("+10 days"));

$rand1 = rand(1000,9999);
$rand2 = rand(1000,9999);
$rand3 = rand(1000,9999);
$sep = "-";
$random = $rand1.$sep.$rand2.$sep.$rand3;

$subject = "Order Placed - ".$random;
$msg = "Hi ".$name.", "."\n\nYour order for ".$prod_name." is placed with Ref Id: ".$random."\nTotal Amount is: ".$total."\n\nExpected Delivery by: ".$exp_del_date;
$from = "myzone@myzone.in";
$header = "From: $from";


if (mail($email, $subject, $msg, $header)) {
        echo "<script>
                alert(\"Your Order has been Placed with Ref ID - '$random'\");
                window.history.go(-1);
              </script>";
} else {
        echo "<script>
                alert(\"Error in placing the Order. Please try again!!\");
                window.history.go(-1);
              </script>";
        
}

$new_quantity = $prod_quantity - $entered_quantity;

try {
        // Query to update the quantity of product
        $conn = new PDO('mysql:host=localhost;dbname=myzone','crestrou','Crestrou!23'); 
       
       //set the PDO error mode to exception
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        
        $conn->beginTransaction();
        $sql = "UPDATE product_detail SET prod_quantity = $new_quantity WHERE prod_name='$prod_name'";
        
        //Prepare statement
        $stmt = $conn->prepare($sql);
        
        //execute
        $stmt->execute();
        
        $conn->commit();
        
        } catch(PDOException $e) {
            echo $sql."<br>".$e->getMessage();
        }

$conn = null;
?>
