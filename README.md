[![Build Status](https://travis-ci.org/aydarik/serenity-bdd.svg?branch=master)](https://travis-ci.org/aydarik/serenity-bdd)

# Serenity BDD example

### Задача

1. Создать Java-проект при помощи Maven на основе архетипа проекта [Serenity JBehave Archetype](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-jbehave-archetype)
2. Автоматизировать поиск слова *'horse'* в [Google Translate](https://translate.google.ru/), тесты написать в виде [JBehave story](http://jbehave.org/reference/stable/developing-stories.html) 

### Дополнительно

- Выбор драйвера через Maven Profile (Chrome, Firefox)
- Подключены ресурсы для корректного отображения отчета JBehave (`target/jbehave/view/reports.html`)
- [Travis  CI](https://travis-ci.org/aydarik/serenity-bdd)

### Планы
- [ ] Тестирование с разными языками перевода
- [ ] Добавить драйвер [PhantomJS](http://phantomjs.org/) (интересно)