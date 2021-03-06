package org.fightteam.avalon.data.models;

import lombok.Getter;
import lombok.Setter;
import org.fightteam.avalon.security.data.models.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * 管理系统用户
 *
 * @author faith
 * @since 0.0.1
 */
@Entity
@Getter
@Setter
public class Manager extends User {
    private String name;
}
