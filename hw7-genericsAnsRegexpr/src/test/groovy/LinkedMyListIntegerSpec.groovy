import spock.lang.Specification

class LinkedMyListIntegerSpec extends Specification {

        def "1: check empty size array"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()

            expect:
            myList.size() == 0
        }

        def "2: check toArray of empty array"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()

            expect:
            myList.toArray(new Integer[0]) == []
        }

        def "4: check add element into list and size eq 1"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()

            when:
            myList.add(5)

            then:
            myList.size() == 1
        }

        def "5: check add element into list and toArray is correct"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()

            when:
            myList.add(5)

            then:
            myList.toArray(new Integer[0]) == [5]
        }

        def "6: check add element into list and get method is correct"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()

            when:
            myList.add(5)

            then:
            myList.get(0) == 5
        }

        def "7: check insert method"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()
            myList.add(2)
            myList.add(3)
            myList.add(4)

            when:
            myList.insert(10, 1)

            then:
            myList.toArray(new Integer[0]) == [2, 10, 3, 4]
        }

        def "8: check insert method"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()
            myList.add(2)
            myList.add(3)
            myList.add(4)

            when:
            myList.insert(10, 0)

            then:
            myList.toArray(new Integer[0]) == [10, 2, 3, 4]
        }

        def "8: check delete method"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()
            myList.add(1)
            myList.add(2)
            myList.add(3)
            myList.add(4)

            when:
            myList.delete(0)

            then:
            myList.toArray(new Integer[0]) == [2, 3, 4]
        }

        def "9: check delete method"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()
            myList.add(1)
            myList.add(2)
            myList.add(3)
            myList.add(4)

            when:
            myList.delete(3)

            then:
            myList.toArray(new Integer[0]) == [1, 2, 3]
        }

        def "10: check add first method"() {
            given:
            MyList<Integer> myList = new LinkedMyList<>()
            myList.add(1)
            myList.add(2)
            myList.add(3)
            myList.add(4)

            when:
            myList.addFirst(13)

            then:
            myList.toArray(new Integer[0]) == [13, 1, 2, 3, 4]
        }
}
