package bootcamp

class UtilController {

    def save = {
//      Person person = new Person(firstName: "Test", lastName: "Test 2", description: "This is my description")
//      person.save()
//      person.addToDocuments(new Document(fileName: "XYZ1"))
//      person.addToDocuments(new Document(fileName: "XYZ2"))
//      person.addToDocuments(new Document(fileName: "XYZ3"))
//      person.addToDocuments(new Document(fileName: "XYZ4"))
//      println "persons document filenames -: ${person.documents*.fileName}"
//      person.save(flush: true)
//      println "Documents ${Document.list()*.fileName}"
//      person.save(failOnError: true)
//      person.save(deepValidate: false)
        render "Success"
    }

    def get = {
//        Person person = Person.get(1)
//        println ">>>>>>>>>>>${person}"
//        person = Person.get(1000)
//        println ">>>>>>>>>>>${person}"
//        println "Person first Name before update ${person.firstName}"
//        person.firstName = "Uday"
//        println "Person first Name after update ${person.firstName}"
        render "Success"
    }

    def read = {
//        Person person = Person.read(1)
//        println "Person first Name ${person.firstName}"
//        person.firstName = "Uday"
//        println "Person first Name after update ${person.firstName}"
        render "Success"
    }

    def delete = {
//        Person person = Person.get(1)
//        person.delete()
//        person.delete(flush: true)
        render "Success"
    }

    def join = {
//        Person person = Person.get(1)
//        println "*************************"
//        println ">>>>>>>>>>>>>>" + person.documents
        render "Success"
    }

    def cascade = {
//        Person person = new Person(firstName: "Test", lastName: "Test 2", description: "This is my description")
//        person.save()
//        person.addToDocuments(new Document(fileName: "XYZ cascade"))
//        person.save(flush:true)
//        person.documents.clear()
//        person.save(flush:true)
//        println ">>>>>Documents in person>>>>>>${person.documents*.fileName}"
//        println ">>>>>Documents in database>>>>>>${Document.list()*.fileName}"
        render "Success"
    }
}
