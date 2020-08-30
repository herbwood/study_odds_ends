#! /bin/bash

# AND operators

age=25

if [ "$age" -gt 18 -a  "$age" -lt 30 ]
then
	echo "valid age"
	else
	echo "age not valid"
fi


# OR operators

if [ "$age" -eq 18 -o "$age" -eq 75 ]
then 
	echo "valid age"
else
	echo "age not valid"
fi
