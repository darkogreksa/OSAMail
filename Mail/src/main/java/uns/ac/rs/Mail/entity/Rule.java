package uns.ac.rs.Mail.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rule")
public class Rule implements Serializable {

    public enum Condition {
        TO,
        FROM,
        CC,
        SUBJECT
    }

    public enum Operation {
        MOVE,
        COPY,
        DELETE
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rule_id")
    private Long id;

    @Column(name = "condition", unique = false, nullable = false)
    private Condition condition;

    @Column(name = "operation", unique = false, nullable = false)
    private Operation operation;

    public Rule() {
    }

    public Rule(Long id, Condition condition, Operation operation) {
        this.id = id;
        this.condition = condition;
        this.operation = operation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Rule{" +
                "id=" + id +
                ", condition=" + condition +
                ", operation=" + operation +
                '}';
    }
}
