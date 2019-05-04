package uns.ac.rs.Mail.dto;

import uns.ac.rs.Mail.entity.Rule;

import java.io.Serializable;

public class RuleDTO implements Serializable {
    private Long id;
    private Rule.Condition condition;
    private Rule.Operation operation;

    public RuleDTO() {
    }

    public RuleDTO(Long id, Rule.Condition condition, Rule.Operation operation) {
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

    public Rule.Condition getCondition() {
        return condition;
    }

    public void setCondition(Rule.Condition condition) {
        this.condition = condition;
    }

    public Rule.Operation getOperation() {
        return operation;
    }

    public void setOperation(Rule.Operation operation) {
        this.operation = operation;
    }
}
