.class public final Lkn;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkn$a;
    }
.end annotation


# instance fields
.field public final a:Lkl;

.field final b:Lkj;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Lkd;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final f:Lke;

.field public final g:Lko;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final h:Lkn;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final i:Lkn;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final j:Lkn;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public final k:J

.field public final l:J

.field private volatile m:Ljr;


# direct methods
.method constructor <init>(Lkn$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkn$a;->a:Lkl;

    iput-object v0, p0, Lkn;->a:Lkl;

    iget-object v0, p1, Lkn$a;->b:Lkj;

    iput-object v0, p0, Lkn;->b:Lkj;

    iget v0, p1, Lkn$a;->c:I

    iput v0, p0, Lkn;->c:I

    iget-object v0, p1, Lkn$a;->d:Ljava/lang/String;

    iput-object v0, p0, Lkn;->d:Ljava/lang/String;

    iget-object v0, p1, Lkn$a;->e:Lkd;

    iput-object v0, p0, Lkn;->e:Lkd;

    iget-object v0, p1, Lkn$a;->f:Lke$a;

    invoke-virtual {v0}, Lke$a;->a()Lke;

    move-result-object v0

    iput-object v0, p0, Lkn;->f:Lke;

    iget-object v0, p1, Lkn$a;->g:Lko;

    iput-object v0, p0, Lkn;->g:Lko;

    iget-object v0, p1, Lkn$a;->h:Lkn;

    iput-object v0, p0, Lkn;->h:Lkn;

    iget-object v0, p1, Lkn$a;->i:Lkn;

    iput-object v0, p0, Lkn;->i:Lkn;

    iget-object v0, p1, Lkn$a;->j:Lkn;

    iput-object v0, p0, Lkn;->j:Lkn;

    iget-wide v0, p1, Lkn$a;->k:J

    iput-wide v0, p0, Lkn;->k:J

    iget-wide v0, p1, Lkn$a;->l:J

    iput-wide v0, p0, Lkn;->l:J

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lkn;->f:Lke;

    invoke-virtual {v0, p1}, Lke;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a()Lkn$a;
    .locals 1

    new-instance v0, Lkn$a;

    invoke-direct {v0, p0}, Lkn$a;-><init>(Lkn;)V

    return-object v0
.end method

.method public final b()Ljr;
    .locals 1

    iget-object v0, p0, Lkn;->m:Ljr;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lkn;->f:Lke;

    invoke-static {v0}, Ljr;->a(Lke;)Ljr;

    move-result-object v0

    iput-object v0, p0, Lkn;->m:Ljr;

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lkn;->g:Lko;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lkn;->g:Lko;

    invoke-virtual {v0}, Lko;->close()V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkn;->b:Lkj;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lkn;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkn;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkn;->a:Lkl;

    iget-object v1, v1, Lkl;->a:Lkf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
