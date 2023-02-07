zookepeer run: `docker-compose -f common.yml -f zookeeper.yml up`  
zookepeer test(from PowerShell): `tnc localhost -p 2181`  
kafka run: `docker-compose -f common.yml -f kafka_cluster.yml up`  
init kafka topics: `docker-compose -f common.yml -f init_kafka.yml up`
kafka cluster view: http://localhost:9000/  
add new cluster configuration (in 'Cluster Zookeeper Hosts' add zookeeper:2181, some name and Save)
zookepeer stop: `docker-compose -f common.yml -f zookeeper.yml down`  
kafka stop: `docker-compose -f common.yml -f kafka_cluster.yml down` 
