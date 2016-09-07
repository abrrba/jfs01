<?php

    $uname = $_GET['uname'];
    $pass = $_GET['password'];
    
//    $uname ="kaushik_gupta";
//    $pass = "123";
    
    $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
    $statement = $pdo->query("INSERT INTO myzone_users(name, password) VALUES('$uname', '$pass')");
    $sqlcode = $pdo->errorCode();
    
        echo ($sqlcode);
?>