<?php

    $uname = $_GET['uname'];
    $pass = $_GET['password'];
    
    $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
    $statement = $pdo->query("SELECT * FROM myzone_users WHERE name='$uname' AND password='$pass'");
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