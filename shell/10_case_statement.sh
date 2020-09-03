#! /bin/bash

vehicle=$1

case $vehicle in 
	"car" )
		echo "Rent of $vehicle is 100 dollar";;
	"van" )
		echo "Rent of $vehicle is 80 dollar";;
	"bycycle" )
		echo "Rent of $vehicle is 5 dollar";;
	"truck" )
		echo "Rent of $vehicle is 150 dollar";;
	* )
		echo "Unknown vehicle";;
esac


## example

echo -e "Enter some character : \c"
read value

case $value in 
	[a-z] )
		echo "User entered $value a to z" ;;
	[A-Z] )
		echo "User entered $value A to Z" ;;
	[0-9] )
		echo "User entered $value 0 to 9" ;;
	#? : 길이가 1인 character
	? )
		echo "User entered $value special character" ;;

	# * : 길이가 1개 이상인 character
	* )
		echo "Unknwon input" ;;
esac
