create table diary (
    id long,
    created_date date,
    name varchar(10),
    title varchar(20),
    content text,
    state boolean default true
    );