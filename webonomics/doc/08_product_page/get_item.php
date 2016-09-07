<?php

$category = $_GET['search'];

$query_cat = "'".$category."'";
$query_search = "'"."%".$category."%"."'";

// create connection
<<<<<<< HEAD
try {

        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
=======
$pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
>>>>>>> master
        $statement = $pdo->query("SELECT * FROM product_detail WHERE prod_category=$query_cat OR prod_name LIKE $query_search");
        $row = $statement->fetchALL(PDO::FETCH_ASSOC);
        echo json_encode($row);

    } catch(PDOException $e) {

        echo $e->getMessage();
    
    }
?>
