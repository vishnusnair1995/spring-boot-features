#!/usr/bin/env bash


insertClient(){
mongo mongodb://nmsuser:nmspassword@localhost:27017/nmsdb <<EOF
db.server_details.insert(

{
    "ip_addr" : "45.76.208.139",
    "is_added" : true,
    "is_new" : false,
    "last_updated" : NumberLong(1626430233000),
    "name" : "CGW139",
    "snmp_password" : "snmpadmin",
    "snmp_port" : "50200",
    "snmp_protocol" : "udp",
    "snmp_user_name" : "snmpadmin",
    "snmp_version" : "3",
    "status" : "online",
    "unique_id" : "Ek_7TMca5",
    "version" : "3.0.83",
    "downCount" : 0,
    "latitude" : "101",
    "longitude" : "100",
    "group_id" : ObjectId("60f12a0f4f4d1da269029a63"),
    "zone_id" : ObjectId("60d996e86bbff189c10ecb66"),
    "lan_ip" : "100.1.1.37",
    "cpu_utilization" : "0",
    "memory_usage" : 41,
    "disk_usage" : "6",
    "sys_up_time" : "2:45:02.93"
}

)
EOF
}

for ((n=0;n<$1;n++))
    do
        index=$(openssl rand -hex 12);
        insertClient
        
done

