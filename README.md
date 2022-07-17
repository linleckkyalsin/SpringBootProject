## どのようなアプリケーションか？

-学生のデータ（名前、生年月日、メール）を入れられて、作成、参照、更新、削除 （CRUD）という 機能ができる シンプルな アプリ でございます。

## 動作する環境（Javaのバージョン）

Oracale OpenJDK version 18.0.1

## 起動するための手順（データベースの準備やSpring Bootの起動）

- application.properties ていう フォルダ に postgre をつかって データベース と コネクト します。
- student ていう フォルダ に student の class を 開発します。
- student repository には すべての 学生のデータを セレクトします。
- student controller API から リクエストの処理,student service から 機能 を使います。
- student service には CRUD の 機能 をかきます。

## curlコマンド

GET: curl http://localhost:8080/api/v1/student

POST: curl -d '{"name":"kitagawa","dob":"2001-03-05","email":"kitagawa@gmail.com"}' -H "Content-Type: application/json"
-X POST http://localhost:8080/api/v1/student

PUT:curl -X PUT -d "name=hello&dob=1936-02-04" http://localhost:8080/api/v1/student/1

DELETE:curl -X DELETE http://localhost:8080/api/v1/student/1  
