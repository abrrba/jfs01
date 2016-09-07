<?php

// Here in the POST name-value pair you will get the 
// values which were sent by the calling page.
$x = $_POST['x'];
$y = $_POST['y'];

// Calculate the sum here.

$sum = $x + $y;

// Send the sum to the calling page.

echo "Sum is: ".$sum;

?>
