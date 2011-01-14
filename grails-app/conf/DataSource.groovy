dataSource {
    pooled = true
    driverClassName = "com.mysql.jdbc.Driver"
    username = "root"
    password = "igdefault"
    dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
//    loggingSql = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop','update'
            url = "jdbc:mysql://localhost:3306/bootcamp"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/bootcamp"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost:3306/bootcamp"
        }
    }
}
