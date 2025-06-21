package in.tejas.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.tejas.binding.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
