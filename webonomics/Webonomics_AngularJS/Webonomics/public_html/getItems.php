<?php

//    $currentCategory = $_GET['currentCategory'];

    $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
    $statement = $pdo->query("SELECT * FROM product_detail WHERE prod_category='Watches'");
    $row = $statement->fetchALL(PDO::FETCH_ASSOC);
    $error = $pdo->errorCode();

    if ($row) {
        echo json_encode($row);
    }
    else {
        echo ($error);
    }
//?>