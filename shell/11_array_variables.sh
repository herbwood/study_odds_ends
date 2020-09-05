#! /bin/bash

os=( 'ubuntu' 'windows' 'kali' )

echo "${os[@]}"
echo "${os[1]}"
echo "${!os[@]}"
echo "${#os[@]}"
