.class public final Lkl;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkl$a;
    }
.end annotation


# instance fields
.field public final a:Lkf;

.field public final b:Ljava/lang/String;

.field public final c:Lke;

.field public final d:Lkm;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field final e:Ljava/lang/Object;

.field private volatile f:Ljr;


# direct methods
.method constructor <init>(Lkl$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lkl$a;->a:Lkf;

    iput-object v0, p0, Lkl;->a:Lkf;

    iget-object v0, p1, Lkl$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lkl;->b:Ljava/lang/String;

    iget-object v0, p1, Lkl$a;->c:Lke$a;

    invoke-virtual {v0}, Lke$a;->a()Lke;

    move-result-object v0

    iput-object v0, p0, Lkl;->c:Lke;

    iget-object v0, p1, Lkl$a;->d:Lkm;

    iput-object v0, p0, Lkl;->d:Lkm;

    iget-object v0, p1, Lkl$a;->e:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object p1, p1, Lkl$a;->e:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, p0

    :goto_0
    iput-object p1, p0, Lkl;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lkl;->c:Lke;

    invoke-virtual {v0, p1}, Lke;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a()Lkl$a;
    .locals 1

    new-instance v0, Lkl$a;

    invoke-direct {v0, p0}, Lkl$a;-><init>(Lkl;)V

    return-object v0
.end method

.method public final b()Ljr;
    .locals 1

    iget-object v0, p0, Lkl;->f:Ljr;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lkl;->c:Lke;

    invoke-static {v0}, Ljr;->a(Lke;)Ljr;

    move-result-object v0

    iput-object v0, p0, Lkl;->f:Ljr;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Request{method="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lkl;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkl;->a:Lkf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lkl;->e:Ljava/lang/Object;

    if-eq v1, p0, :cond_0

    iget-object v1, p0, Lkl;->e:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
