CREATE TABLE IF NOT EXISTS app_user (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS user_roles (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES app_user(id),
    roles VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS driver (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES app_user(id),
    rating DECIMAL(2,1),
    available BOOLEAN,
    current_location GEOMETRY(Point, 4326)
);

CREATE TABLE IF NOT EXISTS rider (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES app_user(id),
    rating DECIMAL(2,1)
);

CREATE TABLE IF NOT EXISTS wallet (
    id SERIAL PRIMARY KEY,
    user_id INT REFERENCES app_user(id),
    balance DECIMAL(10,2)
);
