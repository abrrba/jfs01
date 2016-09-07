<!DOCTYPE html>
<html>
<body>

<?php
	$i=0;
	$arr2 = array();
	$myfile = fopen("mytext.txt", "r") or die("Unable to open file!");
	while (! feof($myfile)) {
		$line = fgets($myfile);
		$fields = explode("|", $line);
	#	print_r ($fields);
		$dictionary = array ("name" => $fields[0], "roll" => $fields[1], "mark2" => $fields[2], "subject"=> $fields[3]);
		$arr2[$i] = $dictionary;
		$i++;
    	}
#	print_r($arr2);
	echo json_encode($arr2);
	fclose($myfile);
?>

</body>
</html>
