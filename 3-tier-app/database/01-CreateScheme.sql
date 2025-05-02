CREATE TABLE departments (
 id      SERIAL      PRIMARY KEY,
 name    VARCHAR(20) NOT NULL
);

CREATE TABLE students (
 id              SERIAL      PRIMARY KEY,
 department_id   INT         NOT NULL REFERENCES departments (id),
 firstname       VARCHAR(20) NOT NULL,
 lastname        VARCHAR(20) NOT NULL
);
