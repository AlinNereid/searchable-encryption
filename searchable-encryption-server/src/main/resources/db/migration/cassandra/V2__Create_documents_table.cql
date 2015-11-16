
CREATE TABLE IF NOT EXISTS documents (
    documentId bigint PRIMARY KEY,
    userID uuid,
    documentData text
);