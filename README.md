# interview2022
Interswitch Technical Interview

Below are the Steps to Follow During the Application Initialisation

1. Changing the Datatype of column username from varchar(1) to varchar(100) 

ALTER TABLE users
ALTER COLUMN username varchar(100);


2. For the First time, user credentials have to be inserted manually

INSERT INTO emp_dept (emp_dept_name, date_created)
VALUES ('IT', getdate());

INSERT INTO institution_id (institution_code, institution_name, date_created)
VALUES ('INT', 'Interswitch', getdate());

INSERT INTO bank_branch (branch_id, branch_code, branch_name, date_created, institution_id)
VALUES ('MBL', 'Head Office', getdate(), '1');

INSERT INTO users (user_id, username, password, last_name, first_name, email_address, date_created, institution_id, branch_id, emp_dept_id)
VALUES ('interview', 'interview', 'Hergty', 'Tim', 'wasiketim@gmail.com', getdate(), '1', '1', '1');

INSERT INTO user_roles (role_id, role_name, date_created, role_code, role_description)
VALUES ('Administrator', getdate(), 'admin', 'Super Admin, 'Can Create User, Update and Delete'),
(Employee', getdate(), 'admin', 'user, 'Can Create Requests, and View Requests');
