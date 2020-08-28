#! bin/bash

count=10

# -eq : equal
# -ne : not equal
# -gt : is greater than
# -ge : is greater than or equal to
# -lt : is less than
# -le : is less than or equal to

# (($count >= 10))
if [ $count -ge 132 ]
then 
	echo "condition is true"
elif [ $count -le 132 ]
then 
	echo "condition is true"
else
	echo "condition is false"
fi
