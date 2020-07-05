.class final Lfx$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfx$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lfx$2;


# direct methods
.method constructor <init>(Lfx$2;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lfx$2$1;->b:Lfx$2;

    iput-object p2, p0, Lfx$2$1;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lfx$2$1;->b:Lfx$2;

    iget-object v0, v0, Lfx$2;->c:Lfx$a;

    iget-object v1, p0, Lfx$2$1;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lfx$a;->a(Ljava/lang/Object;)V

    return-void
.end method
