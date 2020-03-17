package com.wyz.entity;

    import java.math.BigDecimal;
    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author wuyanzhong
* @since 2020-03-08
*/
    public class User implements Serializable {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String username;

    private String name;

    private BigDecimal balance;

    private Integer age;

        public Long getId() {
        return id;
        }

            public void setId(Long id) {
        this.id = id;
        }
        public String getUsername() {
        return username;
        }

            public void setUsername(String username) {
        this.username = username;
        }
        public String getName() {
        return name;
        }

            public void setName(String name) {
        this.name = name;
        }
        public BigDecimal getBalance() {
        return balance;
        }

            public void setBalance(BigDecimal balance) {
        this.balance = balance;
        }
        public Integer getAge() {
        return age;
        }

            public void setAge(Integer age) {
        this.age = age;
        }

    @Override
    public String toString() {
    return "User{" +
            "id=" + id +
            ", username=" + username +
            ", name=" + name +
            ", balance=" + balance +
            ", age=" + age +
    "}";
    }
}
