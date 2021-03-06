package es.upm.miw.betca_tpv_spring.repositories;

import es.upm.miw.betca_tpv_spring.documents.Ticket;
import es.upm.miw.betca_tpv_spring.dtos.TicketOutputDto;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TicketReactRepository extends ReactiveSortingRepository<Ticket, String> {

    Mono<Ticket> findFirstByOrderByCreationDateDescIdDesc();

    @Query(value = "{}", fields = "{ 'reference' : 1}")
    Flux<TicketOutputDto> findAllTickets();
}