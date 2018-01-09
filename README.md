

Produce avro message to topic "test-topic" on the command line:


$ sudo kafka-avro-console-producer \
         --broker-list localhost:9092 --topic test-topic \
         --property value.schema='{"type":"record","name":"AvroMessage","fields":[{"name":"id","type":"long","name":"message","type":"string"}]}'

Enter text:
{"id": 1, "message": "This is the message"}