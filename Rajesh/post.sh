echo enter mac address to search : "$mac"
curl \
  --header "Content-type: application/json" \
  --request POST \
  --data '{"macaddress": $mac}' \
  https://macaddress.io/
result=$(curl -X GET --header "Accept: */*" https://macaddress.io/)
echo "mac details:"
echo $result
exit
