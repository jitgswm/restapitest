#!/bin/bash
echo "enter MAC address to search : $mac"
result=$(curl -X POST --header "Accept: */*" "https://macaddress.io/")
echo "MAC details"
echo $result
exit
