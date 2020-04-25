.class public final Llo;
.super Ljava/lang/Object;

# interfaces
.implements Lkg$a;


# instance fields
.field public final a:Llh;

.field final b:Llk;

.field final c:Lld;

.field public final d:Lkl;

.field final e:Ljs;

.field final f:Lkc;

.field private final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkg;",
            ">;"
        }
    .end annotation
.end field

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:I

.field private l:I


# direct methods
.method public constructor <init>(Ljava/util/List;Llh;Llk;Lld;ILkl;Ljs;Lkc;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkg;",
            ">;",
            "Llh;",
            "Llk;",
            "Lld;",
            "I",
            "Lkl;",
            "Ljs;",
            "Lkc;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llo;->g:Ljava/util/List;

    iput-object p4, p0, Llo;->c:Lld;

    iput-object p2, p0, Llo;->a:Llh;

    iput-object p3, p0, Llo;->b:Llk;

    iput p5, p0, Llo;->h:I

    iput-object p6, p0, Llo;->d:Lkl;

    iput-object p7, p0, Llo;->e:Ljs;

    iput-object p8, p0, Llo;->f:Lkc;

    iput p9, p0, Llo;->i:I

    iput p10, p0, Llo;->j:I

    iput p11, p0, Llo;->k:I

    return-void
.end method


# virtual methods
.method public final a()Lkl;
    .locals 1

    iget-object v0, p0, Llo;->d:Lkl;

    return-object v0
.end method

.method public final a(Lkl;)Lkn;
    .locals 3

    iget-object v0, p0, Llo;->a:Llh;

    iget-object v1, p0, Llo;->b:Llk;

    iget-object v2, p0, Llo;->c:Lld;

    invoke-virtual {p0, p1, v0, v1, v2}, Llo;->a(Lkl;Llh;Llk;Lld;)Lkn;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lkl;Llh;Llk;Lld;)Lkn;
    .locals 15

    move-object v0, p0

    iget v1, v0, Llo;->h:I

    iget-object v2, v0, Llo;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lt v1, v2, :cond_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1}, Ljava/lang/AssertionError;-><init>()V

    throw v1

    :cond_0
    iget v1, v0, Llo;->l:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, Llo;->l:I

    iget-object v1, v0, Llo;->b:Llk;

    if-eqz v1, :cond_1

    iget-object v1, v0, Llo;->c:Lld;

    move-object/from16 v9, p1

    iget-object v3, v9, Lkl;->a:Lkf;

    invoke-virtual {v1, v3}, Lld;->a(Lkf;)Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "network interceptor "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, Llo;->g:Ljava/util/List;

    iget v5, v0, Llo;->h:I

    sub-int/2addr v5, v2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must retain the same host and port"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    move-object/from16 v9, p1

    :cond_2
    iget-object v1, v0, Llo;->b:Llk;

    if-eqz v1, :cond_3

    iget v1, v0, Llo;->l:I

    if-le v1, v2, :cond_3

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "network interceptor "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, Llo;->g:Ljava/util/List;

    iget v5, v0, Llo;->h:I

    sub-int/2addr v5, v2

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " must call proceed() exactly once"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    new-instance v1, Llo;

    iget-object v4, v0, Llo;->g:Ljava/util/List;

    iget v3, v0, Llo;->h:I

    add-int/lit8 v8, v3, 0x1

    iget-object v10, v0, Llo;->e:Ljs;

    iget-object v11, v0, Llo;->f:Lkc;

    iget v12, v0, Llo;->i:I

    iget v13, v0, Llo;->j:I

    iget v14, v0, Llo;->k:I

    move-object v3, v1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v3 .. v14}, Llo;-><init>(Ljava/util/List;Llh;Llk;Lld;ILkl;Ljs;Lkc;III)V

    iget-object v3, v0, Llo;->g:Ljava/util/List;

    iget v4, v0, Llo;->h:I

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkg;

    invoke-interface {v3, v1}, Lkg;->a(Lkg$a;)Lkn;

    move-result-object v4

    if-eqz p3, :cond_4

    iget v5, v0, Llo;->h:I

    add-int/2addr v5, v2

    iget-object v6, v0, Llo;->g:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    iget v1, v1, Llo;->l:I

    if-eq v1, v2, :cond_4

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "network interceptor "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " must call proceed() exactly once"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    if-nez v4, :cond_5

    new-instance v1, Ljava/lang/NullPointerException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "interceptor "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned null"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object v1, v4, Lkn;->g:Lko;

    if-nez v1, :cond_6

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "interceptor "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned a response with no body"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_6
    return-object v4
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Llo;->i:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Llo;->j:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Llo;->k:I

    return v0
.end method
