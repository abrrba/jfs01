<?php

// create connection
try {
        $pdo = new PDO('mysql:host=localhost;dbname=myzone', 'root', 'root123');

        $statement = $pdo->query("SELECT * FROM categories");
        $row = $statement->fetchALL(PDO::FETCH_ASSOC);
    
        echo json_encode($row);
    
    } catch(PDOException $e) {

            echo $e->getMessage();
    
    }

?>
