package fr.mmarie.core.jira;

import fr.mmarie.api.jira.Comment;
import fr.mmarie.api.jira.input.TransitionInput;
import fr.mmarie.api.jira.response.CommentResponse;
import fr.mmarie.api.jira.response.TransitionResponse;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import rx.Observable;

import java.util.Map;

public interface JiraEndPoints {
    @GET("rest/api/2/issue/{issue}")
    Call<Object> getIssue(@Path("issue") String issue);

    @POST("rest/api/2/issue/{issue}/comment")
    Call<Comment> commentIssue(@Path("issue") String issue, @Body Comment comment);

    @GET("rest/api/2/issue/{issue}/comment")
    Call<CommentResponse> getCommentsOfIssue(@Path("issue") String issue);

    @GET("rest/api/2/issue/{issue}/transitions")
    Observable<TransitionResponse> getTransitionsOfIssue(@Path("issue") String issue);

    @POST("rest/api/2/issue/{issue}/transitions")
    Call<Void> transitionsOnIssue(@Path("issue") String issue, @Body TransitionInput transitionInput);

    @GET("rest/api/2/serverInfo")
    Call<Map<String, Object>> serverInfo();
}
