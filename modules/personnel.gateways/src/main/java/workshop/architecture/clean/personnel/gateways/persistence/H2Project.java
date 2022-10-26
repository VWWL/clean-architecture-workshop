package workshop.architecture.clean.personnel.gateways.persistence;

import workshop.architecture.clean.personnel.domain.Project;

import javax.persistence.*;

@Entity
@Table(name = "ps_projects")
public class H2Project {

    private @Id @Column(name = "id") String id;
    private @Column(name = "employee_id") String employeeId;
    private @Column(name = "name") String name;

    public H2Project() {
    }

    public H2Project(Project project) {
        this.id = project.id();
        this.employeeId = project.employeeId();
        this.name = project.name();
    }

    public Project asDomain() {
        return new Project(id, employeeId, name);
    }

}
