<?php

/*
 * Copyright: www.crestrou.com
 */


//$uname = $_POST['uname'];
//$passwd = $_POST['pwd'];
//$pas_len = strlen($passwd);

// create connection

        /*
         * Here we will be connecting to the MySql DataBase, we will get the connection
         * in the $pdo. 
         * 
         * For running any operation we will need this connection.
         */

        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');
        //$statement = $pdo->query("SELECT * FROM myzone_users WHERE name='$uname' AND password='$passwd'");
        $statement = $pdo->query("SELECT * FROM myzone_users");
        $row = $statement->fetchALL(PDO::FETCH_ASSOC);

        echo "\n";
        echo json_encode($row);

?>
