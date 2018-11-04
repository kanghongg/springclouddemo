## zipkin
zipkin+rabbitmq+elasticsearch
```bash
vim docker-compose.yml

version: '2'
services:
  zipkin:
    container_name: zipkin
    image: openzipkin/zipkin
    environment:
      - STORAGE_TYPE=elasticsearch
      - ES_HOSTS=ip:9002
      - RABBIT_ADDRESSES=ip:5672
    ports:
      - 9411:9411
    networks:
      - zipkin
  zipkin-ui:
    image: openzipkin/zipkin-ui
    container_name: zipkin-ui
    environment:
      - ZIPKIN_BASE_URL=http://ip:9411
    ports:
      - 80:80
    networks:
      - zipkin
networks:
  zipkin:
    driver: bridge
```