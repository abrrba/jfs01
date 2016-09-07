<?php

    $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
    $statement = $pdo->query("SELECT * FROM categories");
    $row = $statement->fetchALL(PDO::FETCH_ASSOC);
    $error = $pdo->errorCode();
//
    if ($row) {
        echo json_encode($row);
    }
    else {
        echo ($error);
    }
    

?>