package bootcamp

class Person implements Serializable {

//    Long personId
    String firstName
    String lastName
    String description
    Date dateCreated
    Date lastUpdated

    static hasMany = [documents: Document]


    static constraints = {
        /*firstName(nullable: false, blank: false, validator: {val, obj ->
            if (obj.lastName == val) {
                String suggestion = val.reverse()
                return ["firstname.cannot.be.equal.to.lastname",suggestion]
            }
        })*/
//        dateCreated(blank: true, nullable: true)
//        lastUpdated(blank: true, nullable: true)
    }

    static mapping = {
//        table 'people'
//        firstName column: 'First_Name'
//        description type:'text'
//        version false
//        id name: 'personId'
//        id composite:['firstName', 'lastName']
//        autoTimestamp false
//        autoTimestamp false
//        sort "firstName"
//        sort firstName:"desc"
//        documents lazy: false
//        documents fetch: 'join'
//        documents cascade:'all-delete-orphan'
    }
}
