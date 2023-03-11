DELETE FROM meal;
DELETE FROM restaurants;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO restaurants (name, address)
VALUES ('Лютик', 'пр. Ленина 40'),
       ('Белые ночи', 'ул. Вавилова 32'),
       ('Ромашка', 'пр. Мира 4');

INSERT INTO meal (name, ingredients, restaurant_id)
VALUES ('Борщ', 'капуста, свёкла, картофель, морковь, лук репчатый, мясо', 100000),
       ('Рагу', 'мясо, морковь', 100000),
       ('Котлеты', 'мясо, лук', 100000),
       ('Солянка', 'Солёные огурцы, корнеплоды, помидоры, зелень, мясо', 100001),
       ('Плов', 'Рис, растительный или животный жир, мясо', 100001),
       ('Гуляш', 'Мясо, лук, сладкий красный перец', 100001),
       ('Щи', 'Белокочанная капуста, квашеная капуста, говядина, картофель', 100002),
       ('Ципленок табака', 'курятина, сметана, соус ткемали', 100002),
       ('Люля-кебаб', 'Баранина, курдючное сало, лук, специи', 100002);
