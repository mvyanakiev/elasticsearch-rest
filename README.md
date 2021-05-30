Spring IOC without SpringBoot.  
Elasticsearch without Spring MVC.

[comment]: <> (docker run -d --name es762 -p 9200:9200 -e "discovery.type=single-node" elasticsearch:7.6.2)

## Yes
docker run -p 9200:9200 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.10.0
https://reflectoring.io/spring-boot-elasticsearch/

## No
https://github.com/thombergs/code-examples/tree/master/spring-boot/spring-boot-elasticsearch
https://www.baeldung.com/spring-data-elasticsearch-tutorial
https://github.com/eugenp/tutorials/tree/master/persistence-modules/spring-data-elasticsearch
