## Сетевой чат (network chat)

Простой многопоточный чат. 
По умолчанию сервер запускается на порту 8000, есть возможность настроить порт в ручную изменив его в файле "settings.txt" (каталог resources).
На сервере предусмотрено логирование, и сохранение логов в файл log.txt.

Для пользователя доступно подключение к чату в любой момент через консоль. 

Функционал:
- установка имени (ника) - происходит при входе в приложение.
- возможность изменения имени (ника) - доступна при помощи команды "/rename" через пробел необходимо ввести новое имя (пример: /rename New Name);
- выход из чата (/exit);
- вызов справки по командам (/help).