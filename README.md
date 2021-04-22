# Описание реляционной базы данных Instagram

## Основные сущности базы данных

### 1. Profile (cущность - профиль пользователя)
* profileID(PK) - integer
* name - varchar
* login - varchar
* bio - varchar

### 2. Post (сущность - пост)
* postID(PK) - integer
* text - varchar
* image - png

### 3. Comment (cущность - комментарий)
* commentID(PK) - integer
* text - varchar
* tag - integer

### 4. Like (cущность - лайк)
* likeID - integer

### 5. Profile_Post (таблица-связка профиля с постом)
* profileID(PK, FK)
* postID(PK, FK)

### 6. Post_Comment (таблица-связка поста с комментариями)
* postID(PK, FK) 
* commentID(PK, FK)

### 7. Post_Like (таблица-связка поста с лайками)
* postID(PK, FK)
* likeID(PK, FK)

### 8. Comment_Like (таблица-связка комментария с лайками)
* commentID(PK, FK)
* likeID(PK, FK)

### 9. Profile_Like (таблица-связка лайка с профилем)
* profileID(PK, FK)
* like_ID(PK, FK)


