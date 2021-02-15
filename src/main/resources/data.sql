INSERT INTO employee (employee_id, employee_name, age) values (1,'山田太郎',30);
INSERT INTO employee (employee_id, employee_name, age) values (2,'スズキ一郎',51);

INSERT INTO m_user (user_id, password, user_name, birthday, admin, role) VALUES ('abe.akira@tis.co.jp','$2a$10$4kLS1ieCWp5OQQFnRnQlDuRmL8KeVeVziLny.1jcNM.k/NO7G2xPK','Akira Abe','1968-01-05', true, 'ROLE_ADMIN');
INSERT INTO m_user (user_id, password, user_name, birthday, admin, role) VALUES ('root@tis.co.jp','$2a$10$4kLS1ieCWp5OQQFnRnQlDuRmL8KeVeVziLny.1jcNM.k/NO7G2xPK','Root User','1990-12-31', false, 'ROOT');
