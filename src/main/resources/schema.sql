/* 従業員テーブル */
CREATE TABLE IF NOT EXISTS
employee (
  employee_id INT PRIMARY KEY,
  employee_name VARCHAR(50),
  age INT
);

/* ユーザーマスター */
CREATE TABLE IF NOT EXISTS m_user (
  user_id VARCHAR(50) PRIMARY KEY,
  password VARCHAR(100),
  user_name VARCHAR(50),
  birthday DATE,
  admin BOOLEAN,
  role VARCHAR(50)
);