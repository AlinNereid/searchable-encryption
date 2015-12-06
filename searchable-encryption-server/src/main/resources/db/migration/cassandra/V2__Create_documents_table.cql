
CREATE TABLE IF NOT EXISTS documents (
    documentId bigint PRIMARY KEY,
    userID uuid,
    documentData text,
    encType text,
    docTime timestamp
);

CREATE INDEX encTypeIndex
   ON sencrypt.documents (encType);