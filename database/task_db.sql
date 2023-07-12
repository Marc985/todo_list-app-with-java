CREATE TABLE task (
    id_task int primary key,
    description varchar(100),
    deadline date CHECK (deadline > CURRENT_DATE)
);
