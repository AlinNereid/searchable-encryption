
# Server Side

This module will expose REST endpoint in order to access search and encryption services.



### Cassandra migration
Make sure you have DataStax Cassandra installed

Step 1: in cqlsh

- Run script for keyspace
```
CREATE KEYSPACE IF NOT EXISTS sencrypt with replication = { 'class' : 'SimpleStrategy', 'replication_factor': 1};
```

Step 2:
- Run CassandraMigrationTest (Temporary)


Step 3: 

```
use sencrypt;
```