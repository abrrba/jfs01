<?php

$category = $_GET['search'];

$query_cat = "'".$category."'";
$query_search = "'"."%".$category."%"."'";


// create connection
try {
        if (gethostname() == "garima-lappy" || gethostname() == "rishi-lappy" ) {
                $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
        } else {
                $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'crestrou', 'Crestrou!23');
        }
                $statement = $pdo->query("SELECT * FROM product_detail WHERE prod_category=$query_cat OR prod_name LIKE $query_search");
                $row = $statement->fetchALL(PDO::FETCH_ASSOC);
                echo json_encode($row);
} catch(PDOException $e) {
        echo $e->getMessage();
}
?>
