#### Какие принципы SOLID **учтены** при реализации _связного
списка_? Проиллюстрируйте примером каждый из названых принципов.

Single Responsibility - так как все методы выполняют только одну вещь (добавляют элемент в конец, удаляют элемент и
т.д.)
и в классе также всё хорошо, то есть если нам захочется добавить новый метод, то нам не придётся
менять другие методы, так как они не перегружены несколькими действиями,
а ещё у нас и классы каждый за своё отвечают, то есть один образует объект, другой выстраивает
список и т.д..
Interface Segregation - так как все методы, которые находятся в классе, нужны для реализации задач, вернее нет лишних
методов, которые не использовались бы в тестах
в таком случае не было бы учтено:
interface AnimalSounds {
void soundCat();
void soundDog();
void soundCow();
}
class Сat implements AnimalSounds{
void soundCat(){};
void soundDog(){};
void soundCow(){};
}
так как в классе Cat нам нужен только звук который издает кошка, но пам приходится ещё и
выдавать звуки, которые делают собака с коровой, так как это методы тоже находяться в
интерфейсе

Open-closed - так как класс MyList поддается расширению, но не модификации, то есть, мы можем из него наследовать классы
которые впоследствии мы сможем модифицировать, при это не затрагивая наш абстрактный класс MyList
он будет расширяем, т.е. можно создать наследников, но сам класс мы менять не будем, а только уже его
наследников
и ещё так как я могу вложить класс Node в классы MyList, LinkedMyList
Liskov Substitution - так как все методы родительского абстрактного класса MyList передаются в классы наследники и
реализуются
или выполняются там также как и в классе MyList, то есть без изменений

#### Какие принципы SOLID **не были** учтены при реализации _связного
списка_? Проиллюстрируйте примером каждый из названых принципов. Объясните, почему

Dependency Inversion - не был учтен так как у моего решения задач нет такой структуры, где бы использовался этот принцип

#### Какие принципы SOLID **учтены** при реализации _странного связного
списка_? Проиллюстрируйте примером каждый из названых принципов.

Single Responsibility
Interface Segregation
Open-closed
Liskov Substitution

у всех принципов то же объяснение как и в первом, так как в этом случае я тоже наследую класс MyList или вернее создаю
объект этого класса с анонимным классом в нём, который перенимает методы абстрактного класса

#### Какие принципы SOLID **не были** учтены при реализации _странного связного
списка_? Проиллюстрируйте примером каждый из названых принципов.

Dependency Inversion - в этом случае тоже просто не используется этот метод так как структура не подходящая 

